package com.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * Rules - É um componente que intercepta uma chamada para um metodo de teste. Permite que execute alguma tarefa antes ou depois do
 * metodo ser executado
 * 
 * @author Fernando
 *
 */

public class RuleTest {
	
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();
	
	@Test
	public void shouldCreateNewFileTemporaryFolder() throws IOException{
		File created = tmpFolder.newFile("file.txt");
		
		assertTrue(created.isFile());
		assertEquals(tmpFolder.getRoot(), created.getParentFile());
	}
}
