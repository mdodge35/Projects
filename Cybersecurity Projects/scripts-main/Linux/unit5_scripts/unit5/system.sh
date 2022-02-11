#!/bin/bash
# Free memory output to a free_mem.txt file
free -m > ~/Desktop/unit5/backups/freemem/free_mem.txt

# Disk usage output to a disk_usage.txt file
df -h > ~/Desktop/unit5/backups/diskuse/disk_usage.txt

# List open files to a open_list.txt file
lsof > ~/Desktop/unit5/backups/openlist/open_list.txt

# Free disk space to a free_disk.txt file
df > ~/Desktop/unit5/backups/freedisk/free_disk.txt

