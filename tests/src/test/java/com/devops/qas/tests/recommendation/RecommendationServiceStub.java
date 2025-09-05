package com.devops.qas.tests.recommendation;

import java.util.Collections;
import java.util.List;

public class RecommendationServiceStub {

    public List<String> getRecommendations(Long alunoId) {
        // Stub: retorna vazio, causando falha no teste
        return Collections.emptyList();
    }

    public boolean sendRecommendationEmail(Long alunoId, String email) {
        // Stub: retorna sempre false → falha no teste
        return false;
    }

    public List<String> filterRecommendationsByCategory(Long alunoId, String categoria) {
        // Stub: retorna vazio → falha no teste
        return Collections.emptyList();
    }

    public boolean saveRecommendationForLater(Long alunoId, String curso) {
        // Stub: retorna false → falha no teste
        return false;
    }

    public boolean markRecommendationAsUseful(Long alunoId, String curso) {
        // Stub: retorna false → falha no teste
        return false;
    }
}
