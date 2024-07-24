package com.ecole.ecole.Service;

import com.ecole.ecole.Models.Niveau;
import com.ecole.ecole.dao.NiveauRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


class NiveauServiceTest {


    @Mock
    private NiveauRepo niveauRepo;
    @InjectMocks
    private NiveauService underTest;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void should_update_niveau_when_niveau_exists() {

        var niveau = new Niveau(5L, " 5eme");

        when(niveauRepo.findById(5L)).thenReturn(Optional.of(niveau));
        when(niveauRepo.save(any())).thenReturn(niveau);

        var savedNiveau = underTest.updateNiveau(niveau);

        assertNotNull(savedNiveau);
        assertEquals(niveau, savedNiveau);
    }
    @Test
    public void should_not_update_niveau_when_niveau__does_not_exists() {

        var niveau = new Niveau(5L, " 5eme");

        when(niveauRepo.findById(5L)).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class , ()-> underTest.updateNiveau(niveau));
        verify(niveauRepo, times(0)).save(any());
    }





}