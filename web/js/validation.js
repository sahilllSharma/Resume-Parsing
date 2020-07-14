function isEmpty(str){
    if(str==="")
        return true;
    else 
        return false;
    
}
function checkContact(str)
{
	if(str.length==10)
		return true;
	else
		return false;
	
}
function checkDigits(str)
{ var c;
	for(var i=0;i<str.length;i++)
	{
		if(str.charAt(i)==1||str.charAt(i)==2||str.charAt(i)==3||str.charAt(i)==4||str.charAt(i)==5||str.charAt(i)==6||str.charAt(i)==7||
		str.charAt(i)==8||str.charAt(i)==9||str.charAt(i)==0)
		{
			c=0;
		}
		else c++;
	}
	if(c==0)
		return true;
	else 
		return false;
	
}
function ValidateEmail(emailField)
{
        var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

        if (reg.test(emailField) == false) 
        {
            return false;
        }

        return true;

}