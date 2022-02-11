## Automated ELK Stack Deployment

The files in this repository were used to configure the network depicted below.
(Diagrams/Azure-Virual-Network.png)

These files have been tested and used to generate a live ELK deployment on Azure. They can be used to either recreate the entire deployment pictured above. Alternatively, select portions of the YAML file may be used to install only certain pieces of it, such as Filebeat.

  - (Ansible/my-playbook.yml) (Ansible/elk/elk-playbook.yml) (Ansible/metricbeat/metricbeat-playbook.yml) (Ansible/filebeat/filebeat-playbook.yml)

This document contains the following details:
- Description of the Topologu
- Access Policies
- ELK Configuration
  - Beats in Use
  - Machines Being Monitored
- How to Use the Ansible Build


### Description of the Topology

The main purpose of this network is to expose a load-balanced and monitored instance of DVWA, the D*mn Vulnerable Web Application.
Load balancing ensures that the application will be highly available, in addition to restricting access to the network.
-  What aspect of security do load balancers protect? Load Balancers protect the availability of resources by controlling the flow of traffic. This prevents flooding of servers and Dos attacks. What is the advantage of a jump box? The jump box is used to deploy IAC to the rest of your network. It is secured and used in conjunction with your IP and SSH Key so only you will be able to make changes on the network.

Integrating an ELK server allows users to easily monitor the vulnerable VMs for changes to the logs and system traffic.
- What does Filebeat watch for? Filebeat watches for log files and log events.
- What does Metricbeat record? Metricbeat records metric and statistical data.

The configuration details of each machine may be found below.
_Note: Use the [Markdown Table Generator](http://www.tablesgenerator.com/markdown_tables) to add/remove values from the table_.

| Name     | Function | IP Address | Operating System |
|----------|----------|------------|------------------|
| Jump Box | Gateway | 10.0.0.4 | Linux            |
| Web-1 | Web Server | 10.0.0.5 | Linux            |
| Web-2 | Web Server | 10.0.0.6 | Linux            |
| Web-3 | Web Server | 10.0.0.9 |Linux                |
| Elk   | Monitoring | 10.1.0.4 |
Linux            |

### Access Policies

The machines on the internal network are not exposed to the public Internet. 

Only the Jump Box machine can accept connections from the Internet. Access to this machine is only allowed from the following IP addresses: 23.243.231.101

Machines within the network can only be accessed by SSH (Secure Shell).
- The Jump Box VM (10.0.0.4) is the only machine that can access the Elk VM. 

A summary of the access policies in place can be found in the table below.

| Name     | Publicly Accessible | Allowed IP Addresses |
|----------|---------------------|----------------------|
| Jump Box | Yes   | 23.243.231.101 |
| Web-1    | No    | 10.0.0.4       | 
| Web-2    | No    | 10.0.0.4       |
| Web-3    | No    | 10.0.0.4       |
| Elk      | No    | 10.0.0.4       |

### Elk Configuration

Ansible was used to automate configuration of the ELK machine. No configuration was performed manually, which is advantageous for multiple reasons. It is easy to use, there are fewer errors, Ansible can keep all VMs on the same software, and can keep them up to date.

The playbook implements the following tasks:
- Install docker.io
- Install python3-pip
- Install docker module
- Use more virtual memory
- Downlaod and Launch Docker

The following screenshot displays the result of running `docker ps` after successfully configuring the ELK instance.

(Images/elk.png)

### Target Machines & Beats
This ELK server is configured to monitor the following machines:
- Web-1: 10.0.0.5
- Web-2: 10.0.0.6
- Web-3: 10.0.0.9

We have installed the following Beats on these machines:
- Filebeat on Web-1, Web-2, and Web-3
- Metricbeat on Web-1, Web-2, and Web-3

These Beats allow us to collect the following information from each machine:
- Filebeat collects Log files and Log Events. An example would be usage patterns, activities, and operations within the device.
-Metricbeat collects metrics and statistics. An example would be the time, frequency, and duration a server is accessed. 

### Using the Playbook
In order to use the playbook, you will need to have an Ansible control node already configured. Assuming you have such a control node provisioned: 

SSH into the control node and follow the steps below:
- Copy the playbook.yml file to /etc/ansible.
- Update the host file to include the group, VM, and interpreter you want to use. For Example:
- [webservers]
10.0.0.5 ansible_python_interpreter=/usr/bin/python3
- Run the playbook, and navigate to [Elk Public Ip]:5601/app/kibana to check that the installation worked as expected.

_TODO: Answer the following questions to fill in the blanks:_
- Which file is the playbook? Where do you copy it? elk-playbook.yml. you copy it to /etc/ansible
- Which file do you update to make Ansible run the playbook on a specific machine? How do I specify which machine to install the ELK server on versus which to install Filebeat on? You would update the host file. In the playbook file specify the host.
- Which URL do you navigate to in order to check that the ELK server is running? The url to check is: 
http://[Elk Public ip]:5601/app/kibana

These commands will help download the files necessary to download, update, and run the playbook files:
- cd /etc/ansible
- git clone https://github.com/mdodge1408/scripts.git
- sudo nano (name of playbook)-playbook.yml
- sudo nano hosts
- ansible-playbook (name of playbook)
