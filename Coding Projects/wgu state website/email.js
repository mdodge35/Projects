function validateName(){
    var fname = (document.getElementById("fname").value) ? this.fname.value : alert('Please Enter Your First Name');
    var lname = (document.getElementById("lname").value) ? this.lname.value : alert('Please Enter Your Last Name');
    var email = (document.getElementById("email").value) ? this.email.value : alert('Please Enter Your Email Address');
    var vemail = (document.getElementById("vemail").value) ? this.vemail.value : alert('Please Enter Your Email Address Again');

    if(email != vemail){
        alert("The Emails Do Not Match!");
    }else{
        alert("Thank You For Sending Your Question, We will Reply As Soon As Possible!");
    }

    
    
    
    


}