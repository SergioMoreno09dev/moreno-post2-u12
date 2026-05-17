package com.universidad.estudiantes;

import com.universidad.estudiantes.model.Curso;
import com.universidad.estudiantes.model.Estudiante;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EstudiantesApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void agregarEstudianteActualizaAmbosSentidos() {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Juan");
		estudiante.setApellido("Moreno");
		estudiante.setCorreo("juan.moreno@udes.edu.co");
		estudiante.setCarrera("Ingeniería de Sistemas");

		Curso curso = new Curso();
		curso.setNombre("Programación Web");
		curso.setCreditos(3);

		curso.agregarEstudiante(estudiante);

		assertTrue(curso.getEstudiantes().contains(estudiante));
		assertTrue(estudiante.getCursos().contains(curso));
	}

	@Test
	void quitarEstudianteActualizaAmbosSentidos() {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Ana");
		estudiante.setApellido("García");
		estudiante.setCorreo("ana.garcia@udes.edu.co");
		estudiante.setCarrera("Ingeniería de Sistemas");

		Curso curso = new Curso();
		curso.setNombre("Base de Datos");
		curso.setCreditos(4);

		curso.agregarEstudiante(estudiante);
		curso.quitarEstudiante(estudiante);

		assertFalse(curso.getEstudiantes().contains(estudiante));
		assertFalse(estudiante.getCursos().contains(curso));
	}
}