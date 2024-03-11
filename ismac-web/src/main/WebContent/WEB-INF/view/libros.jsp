<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libros</title>
</head>
<body>

	<h1>Libros</h1>
	
	<button>
		<a href="${pageContext.request.contextPath}/libros/findOne?opcion=1">Agregar</a>
	</button>
	
	<table>
			<tdead>
				<tr>
					<td>idLibro</td>
					<td>titulo</td>
					<td>editorial</td>
					<td>numPaginas</td>
					<td>edicion</td>
					<td>idioma</td>
					<td>fechaPublicacion</td>
					<td>descripcion</td>
					<td>tipoPasta</td>
					<td>ISBN</td>
					<td>numEjemplares</td>
					<td>portada</td>
					<td>presentacion</td>
					<td>precio</td>
					<td>id_categoria</td>
					<td>id_autor</td>
					<td>acciones</td>
					
			</tr>
			
			</tdead>
		<tbody>
			<c:forEach var="item" items="${libros }">
				<tr>
					<td>${item.idLibro}</td>
					<td>${item.titulo}</td>
					<td>${item.editorial}</td>
					<td>${item.numPaginas}</td>
					<td>${item.edicion}</td>
					<td>${item.idioma}</td>
					<td>${fn:substring(item.fechaPublicacion,0,10)}</td>
					<td>${item.descripcion}</td>
					<td>${item.tipoPasta}</td>
					<td>${item.ISBN}</td>
					<td>${item.numEjemplares}</td>
					<td><img width="100" height="100" src="${pageContext.request.contextPath}/resources/img/${item.portada}"/>	</td>
					<td>${item.presentacion}</td>
					<td>${item.precio}</td>
					<td>${item.categoria.categoria}</td>
					<td>${item.autor.nombre}${item.autor.apellido}</td>
					<td>
						<button><a href="${pageContext.request.contextPath}/libros/findOne?idLibro=${item.idLibro}&opcion=1">Actualizar</a></button>
						<button><a href="${pageContext.request.contextPath}/libros/findOne?idLibro=${item.idLibro}&opcion=2">Eliminar</a></button>
					
					</td>
					
				</tr>
			</c:forEach>
		
		</tbody>
	</table>

</body>
</html>