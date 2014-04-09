package com.pucminas.carofour.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pucminas.carofour.model.Categoria;

public class HomeServletTest {

	@Test
	public void testcategoria() {
		assertTrue(Categoria.listarCategorias().size() == 4);
	}

}
