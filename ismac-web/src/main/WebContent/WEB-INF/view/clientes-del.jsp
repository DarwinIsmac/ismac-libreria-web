<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar clientes</title>
</head>
<body>
		<h>Eliminar clientes</h>
		
		<form action ="del" method="GET">
		
			<input type="hidden" id="idCliente" name="idCliente"  value="${cliente.idCliente }">
			<strong>¿Desea elminar el dato?</strong>
			<br/><br/>
			<button type="submit">Aceptar</button>
			<button type="button" onclick="window.location.href='/ismac-libreria-web/clientes/findAll;return false;'">Cancelar</button>
				
		
		</form>

</body>
</html>