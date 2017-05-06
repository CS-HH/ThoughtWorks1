/**
 * Created by Tom on 2017/5/6.
 */
function loadXMLDoc()
{
    var xmlhttp;
    if (window.XMLHttpRequest)
    {
        //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        // IE6, IE5 浏览器执行代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function()
    {
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        {
            var name = xmlhttp.responseText;
            alert("haha");
        }
    }
    xmlhttp.open("post","servlet?name=huhong",true);
    xmlhttp.send();
}