<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.dropdown {
	position: relative;
	display: inline-block;
	margin-left: 0px;
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown-content {
	display: none;
	z-index: 1;
	background-color: white;
	box-shadow: 0px -5px 10px 0px rgba(0, 0, 0, 0.5);
	margin-top: -10px;
	padding: 70px;
	position: absolute;
}

.div1 {
	margin-left: 2%;
	margin-right: 2%;
	background: white;
}


.tabl {
	padding-left: 50px;
	padding-right: 50px;
	align-content: center;
	align-items: center;
}
</style>
</head>

<body>

	<div class="div1">

		<table>

			<tr>
				<td><a href="#"><img style="width: 50%; height: 20%"
						class="img1"
						src="https://1000logos.net/wp-content/uploads/2021/02/Flipkart-logo.png"></a>
				</td>
				<td style="padding-right: 100%"><input type="search" id="query"
					name="q" placeholder="Search  for  products,brands and more..."
					style="width: 500px; height: 30px"></td>
				<td><a href="Home"><img
						style="height: 30px; width: 25px; padding-top: 25px; padding-left: 40px"
						src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6l7M0h5zfUDMXQD0ycAUM6o7Y8HB43D2l6Q&usqp=CAU">
						<p style="padding-left: 43px; color: black">Home</p></a></td>
				<td>
				<td><a href="showCart"><img
						style="height: 30px; width: 25px; padding-top: 25px; padding-left: 40px"
						src="data:image/png;base64,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">
						<p style="padding-left: 43px; color: black">Cart</p></a></td>
				<td><span class="div3"><a href="orderList"><img
							style="height: 30px; width: 25px; padding-top: 25px; padding-left: 43px"
							src="https://static.thenounproject.com/png/1541555-200.png">
							<p style="padding-left: 43px; color: black">Ordered</p></a></span></td>



				<td>
							<div class="dropdown">
						<img style="height: 30px; width: 25px; padding-top: 25px; padding-left: 50px; padding-right: 20px" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAH4AAAB+CAMAAADV/VW6AAAAY1BMVEX///8AAAD29vYQEBD7+/vh4eHe3t55eXno6OghISGysrLw8PB0dHSenp7R0dGFhYVQUFAqKiowMDCqqqpqamq/v7+kpKQWFhbIyMiLi4vY2NhDQ0NiYmJVVVWSkpK4uLg6OjreC2bWAAAEtklEQVRoge1a6daqOgxVZJ5BUUbh/Z/yaEKdkQRTv3Xvcv/UtqFpujM0q9UP/0mYgWW55l9ItvwkXY8Ywqj8puy48taP2BXfUYNZdE+yAXkU6JceTwiHD9gbeoUb4Z28bBjyw+0PTaxTerm5nvU2Hrdq2n5ytYVKn/SjktH1j1quHaWFVJcFKMV39at/3WpUTWNrke6M591PDbBGq8wtDdITXLt9p9s9jjnIX4AKV47ej7LRBgdpCupR+qTiFYIMxjmy0t0DTfppJMr3RcXvKJpHoP4PrqD0EpmGNrjgDKbAHM4LbqjDkZ3k6BftjuzTjRxuqJR0s2Muh+qXIp8YVnvJtBMA60+ExIdsXcJpeTLcZ2Sskz/D9NhTJgG3Lue5UUdO+9ECFoVPTkWYv1tAokC9ngjzgd1zQ5iOe1mmYIJ47iyH6KFmYUMAxZ0VkV3UDOpFDNpLmT4YcfidWbLiJZxuvGihQirkgrPvuLO251lHAfEuhK7cWRAY7wXEI+1w+XMn5nOGBQRmNFKshwTGZBD7nO8NIsmmv8D0fbloD3ay5nmvVMzyVquGrX1bMtaEO9xwIjfIhjuhPBMTPEbAYcDmtzLSR9vP6JupFoUIk7BgOXLRCE9ewtmPSDiJhgE8JVnhwMPMaDSCNSDRBB+Mf91SdgRhFt9FvgcWrQjch9nwRri4NdZsurn9o5qE8qsb1Fg0fF+zM8fanxDd3gILLOvNG5uqGxwjlVq/kr9uJ4qmhir5apGuygznuPfFBxiR+lciwnuJ4Pp8s7/joKDYqX/WhS7pJ9O6lNRPJLSLijKOy2LrDNcnhVSynveMuFm/gbfX/p7k55PSK71bH/H6Kcv7xkMWItjv7l/y0kokqKbDsPtjuDuj2tbBn7yk/vDDD1+FG/fHpG3yE4bOOW4LHQ+XL2HafpgdHil346VRrJ11zbpKN4+iLxjCQucXGNt0UrRyPImuY3CTOdmIVkcbi+XcyTjZm1/WtutaduyfrPDOAQ7SH2BU1xP32ujZxRmWHw43GhBtISgvEc6m7SdDmqB0sssHyOXX5vXQjzOGFfSXD22EbLBW53oglUvKy+0Qqa74Su1kdZbKCMLPgyAV2YeMKNaMVBPLpyUOdd2Yr0Iq2cw/C73H3Knhc+lorh+95Y0B/aKUtRjtdfkFcD6y4BpJgFiQeka06NivsPEGDMtmU1t1pmEhBy16UcJS5mf1ORfXWFDqMbOlM2+B9dUFXSzJcpu/Bdr/wKUfrOMINAAcl2zDRNaSiNyQO3j5d/S52Sm4/Nvngo8V6jvy2fcX7O4gFTA1TOvDxxux8mDMPEl4i/HkMoaW5ftNCcK5BZIPtdyJNXnJahGEDSlxcCN68mdwet7Q14gWKLHjj7YjMDzhpyA4T1K3Jb78C5fFTbLjs4VvHQKMj5IpQJ+1YJsrwqfafivmbG6BjmeeeQKID+Vb7IntkzWLIOlIaFev13L047rzrV9HqokyEdO02tLOiA14BD7M3udcKsZ7BJj0bMKX6RLfUXgPAh12WE6BQ+ETaFGS6e99AKmFDgy0NeSBsftc98vllVoP5pLdcn6JTzDHO38sPtArfjbXidONNmRiXWQ//A/wD7XSMhyL2SKGAAAAAElFTkSuQmCC"><p style="padding-left: 55px; padding-right: 50px">profile
						</p>
						<div class="dropdown-content">
							<%
					String name = (String) session.getAttribute("name");
					if (name != null) {
					%>
							<p>HelloUser</p>
							<hr>
							${sessionScope.name}<br><br>
							 <a href="logOut"><button
									style="border-radius: 10px; background-color: pink;width: 50%;text-align: center;">Logout</button></a>
							<%
 } else {
 %>
							<p style="">HelloUser</p>
							<hr>
							<br> <a href="/"><button
									style="border-radius: 10px; background-color: pink;width: 100%">SignIn</button></a>

							<%
				}
				%>




						</div>
					</div>
					
				</td>

			</tr>

		</table>
<hr>

	</div>
</body>
</html>