package com.devops.qas.tests.recommendation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class RecommendationTests {

    // --- Integrante 1 ---
    @Test
    void deveExibirRecomendacoesNaPaginaInicialQuandoAlunoConcluiuCurso() {
        // Arrange
        RecommendationServiceStub service = new RecommendationServiceStub();
        Long alunoId = 1L;

        // Act
        List<String> recomendacoes = service.getRecommendations(alunoId);

        // Assert
        assertNotNull(recomendacoes, "As recomendações não deveriam ser nulas");
        assertFalse(recomendacoes.isEmpty(), "A lista deveria conter cursos recomendados");
    }

    // --- Integrante 2 ---
    @Test
    void deveEnviarEmailComRecomendacoesQuandoAlunoPossuiEmailValido() {
        // Arrange
        RecommendationServiceStub service = new RecommendationServiceStub();
        Long alunoId = 2L;

        // Act
        boolean enviado = service.sendRecommendationEmail(alunoId, "aluno@teste.com");

        // Assert
        assertTrue(enviado, "O e-mail com recomendações deveria ter sido enviado");
    }

    // --- Integrante 3 ---
    @Test
    void deveFiltrarRecomendacoesPorCategoriaQuandoAlunoSelecionaCategoria() {
        // Arrange
        RecommendationServiceStub service = new RecommendationServiceStub();
        Long alunoId = 3L;

        // Act
        List<String> recomendacoes = service.filterRecommendationsByCategory(alunoId, "Tecnologia");

        // Assert
        assertNotNull(recomendacoes, "A lista filtrada não deveria ser nula");
        assertTrue(recomendacoes.stream().allMatch(curso -> curso.contains("Tecnologia")),
                "Todas as recomendações deveriam ser da categoria escolhida");
    }

    // --- Integrante 4 ---
    @Test
    void deveSalvarCursoNaListaPessoalQuandoAlunoClicaEmSalvarParaDepois() {
        // Arrange
        RecommendationServiceStub service = new RecommendationServiceStub();
        Long alunoId = 4L;
        String curso = "Curso de DevOps";

        // Act
        boolean salvo = service.saveRecommendationForLater(alunoId, curso);

        // Assert
        assertTrue(salvo, "O curso deveria estar salvo na lista pessoal do aluno");
    }

    // --- Integrante 5 ---
    @Test
    void deveRegistrarAvaliacaoQuandoAlunoMarcaRecomendacaoComoUtil() {
        // Arrange
        RecommendationServiceStub service = new RecommendationServiceStub();
        Long alunoId = 5L;
        String curso = "Curso de Testes";

        // Act
        boolean registrado = service.markRecommendationAsUseful(alunoId, curso);

        // Assert
        assertTrue(registrado, "A avaliação deveria ter sido registrada");
    }
}
