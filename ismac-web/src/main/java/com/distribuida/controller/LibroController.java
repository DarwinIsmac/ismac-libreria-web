package com.distribuida.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libro;

@Controller
@RequestMapping("/libros")
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	
	@GetMapping("/findAll")
	private String findAll(Model model) {
		List<Libro> libros = libroService.findAll();
		model.addAttribute("libros", libros);
		
		return "libros";
	}
	

		@GetMapping("/findOne")
		
		private String findOne(@RequestParam("idLibro")@Nullable Integer idLibro, @RequestParam("opcion")@Nullable Integer opcion, Model model) {
			if(idLibro!=null) {
				Libro cliente =libroService.findOne(idLibro);
				model.addAttribute("cliente", cliente);
			}
			if(opcion==1) return"libros-add";
			else return "libros-del";
				
					
		}
			

	@PostMapping("/add")
				
	private String add(@RequestParam("idLibro")@Nullable Integer idLibro
			,@RequestParam("titulo")@Nullable String titulo
			,@RequestParam("editorial")@Nullable String editorial
			,@RequestParam("numPaginas")@Nullable int numPaginas
			,@RequestParam("edicion")@Nullable String edicion
			,@RequestParam("idioma")@Nullable String idioma
			,@RequestParam("fechaPublicacion")@Nullable Date fechaPublicacion
			,@RequestParam("descripcion")@Nullable String descripcion
			,@RequestParam("tipoPasta")@Nullable String tipoPasta
			,@RequestParam("iSBN")@Nullable String iSBN
			,@RequestParam("numEjemplares")@Nullable String numEjemplares
			,@RequestParam("portada")@Nullable String portada
			,@RequestParam("presentacion")@Nullable String presentacion
			,@RequestParam("precio")@Nullable Double precio
			,@RequestParam("edicion")@Nullable int categoria
			,@RequestParam("autor")@Nullable int autor
			
			,Model model
			) {

		if(idLibro==null) libroService.add(0, titulo, editorial, numPaginas, edicion, idioma, fechaPublicacion, descripcion, tipoPasta, iSBN, numEjemplares, portada, presentacion, precio, categoria, autor);
		else libroService.up(idLibro, titulo, editorial, numPaginas, edicion, idioma, fechaPublicacion, descripcion, tipoPasta, iSBN, numEjemplares, portada, presentacion, precio, categoria, autor);
		

					
	return "redirect:/libros/findAll";
	
	
	
	}

	@PutMapping("/up")
	private String up() {
		return "redirect:/libros/findAll";
	}
	

	
	@GetMapping("/del")
	private String del(@RequestParam("idLibro")@Nullable Integer idLibro) {
		libroService.del(idLibro);
		return "redirect:/libros/findAll";
	}
}
