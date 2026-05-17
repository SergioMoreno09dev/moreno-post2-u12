package com.universidad.estudiantes;

import com.universidad.estudiantes.model.Curso;
import com.universidad.estudiantes.model.Estudiante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EstudiantesApplicationTests {

	@Test
	void agregarEstudianteSincronizaCursoYEstudiante() {
		Curso curso = new Curso();
		Estudiante estudiante = new Estudiante();

		curso.agregarEstudiante(estudiante);

		assertTrue(curso.getEstudiantes().contains(estudiante));
		assertTrue(estudiante.getCursos().contains(curso));
	}

	@Test
	void quitarEstudianteSincronizaCursoYEstudiante() {
		Curso curso = new Curso();
		Estudiante estudiante = new Estudiante();
		curso.agregarEstudiante(estudiante);

		curso.quitarEstudiante(estudiante);

		assertTrue(curso.getEstudiantes().isEmpty());
		assertTrue(estudiante.getCursos().isEmpty());
	}

}