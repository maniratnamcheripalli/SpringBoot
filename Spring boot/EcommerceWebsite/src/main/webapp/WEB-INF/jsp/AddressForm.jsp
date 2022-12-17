<!DOCTYPE html>
<html lang="en">
<head>
<title>Delivery address</title>
<style>
body {
	
	margin-left: 22%;
	 border : 2px solid black;
	font-family: 'Times New Roman', Times, serif;
	width: 60%;
	height: 80%;
	border: 2px solid black;
}

table {
	margin-left: 30%;
	width: 60%;
	height: 80%;
}

td {
	padding-bottom: 6%;
}

h1 {
	margin-left: 33%;
	padding-bottom: 5px;
}



</style>

</head>
<body>
	<h1>Add delivery address</h1>
	<form action="addressSave" >
		<table>
			<tr>
				<td><b>First Name:</b></td>
				<td><input type="text" name="firstName" required="required"></td>
			</tr>
			<tr>
				<td><b>Last Name:</b></td>
				<td><input type="text" name="lastName" required="required"></td>
			</tr>

			<tr>
				<td><b>Email Id:</b></td>
				<td><input type="email" name="email" required="required"></td>
			</tr>
			 <tr>
				<td><b>Address Line 1:</b></td>
				<td><textarea rows="3" cols="20" placeholder="Address"
						required="required" inputmode="text" ></textarea></td>
			</tr> 
			<tr>
				<td><b>City</b></td>
				<td><input type="text" name="city" required="required"></td>
			</tr>
			<tr>
				<td><b>State</b></td>
				<td><input type="text" name="state" required="required"></td>
			</tr>
			<tr>
				<td><b>Zip/Postal Code</b></td>
				<td><input type="text" name="pin" required="required"></td>
			</tr>

			<tr>
				<td><b>Country:</b></td>
				<td><select style="width: 50%" name="country">
						<option>Select</option>
						<option value="Australia">Australia</option>
						<option value="Antartica">Antartica</option>
						<option value="India">India</option>
						<option value="Iraq">Iraq</option>
						<option value="Usa">USA</option>
						<option value="Japan">Japan</option>
						<option value="Mexico">Mexico</option>
				</select></td>
			</tr>
			<tr>
				<td><b>Mobile Number:</b></td>
				<td><input type="number" name="mobileNumber"
					required="required""></td>
			</tr>
			<tr>
				<td><b>Alternate Number:</b></td>
				<td><input type="number" name="alternateNumber"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit">
					<a href="#"><input type="reset" value="Reset"></a></td>
			</tr>
		</table>
	</form>

</body>
</html>