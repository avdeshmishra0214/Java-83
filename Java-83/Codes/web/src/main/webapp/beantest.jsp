<jsp:useBean id="acc" class="co.edureka.web.Account"></jsp:useBean>
<h2>
A/C No: <jsp:getProperty property="acno" name="acc"/> <br>
A/C Holder Name: <jsp:getProperty property="acname" name="acc"/> <br>
Balance: <jsp:getProperty property="balance" name="acc"/>

<hr>
<jsp:setProperty property="acname" name="acc" value="Sunil Joseph"/>
A/C Holder Name: <jsp:getProperty property="acname" name="acc"/> <br>
</h2>