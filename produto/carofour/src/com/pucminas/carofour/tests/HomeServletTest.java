package com.pucminas.carofour.tests;

import com.pucminas.carofour.model.Categoria;
import junit.framework.TestCase;

import org.junit.Test;

public class HomeServletTest extends TestCase{

	@Test
	public void testcategoria() {
            assertTrue(Categoria.listarCategorias().size() == 4);
	}

}
