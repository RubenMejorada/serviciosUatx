package com.mx.situatx.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acceso")
public class AccesoController {
	
	@RequestMapping(value="/hola", method = RequestMethod.GET)
	public String inicioUsuario() {
		return "hola";
	}
}
