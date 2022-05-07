package com.upc.backend_sistemagestionaudiendia;

import com.upc.backend_sistemagestionaudiendia.entidades.*;
import com.upc.backend_sistemagestionaudiendia.negocio.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BackEndSistemaGestionAudiendiaApplicationTests {

    // -----------------------DELITO------------------------------------
    @Autowired
    private NegocioDelito negocioDelito;

    @Test
    void contextLoads() {
    }

    @Test
    void probarRegistrar(){
        Delito delito = new Delito();
        delito.setDescripcion("Asalto mano armada");

        Delito d = null;
        d = negocioDelito.registrarDelito(delito);
        Assert.assertNotNull(d);
    }


    // -----------------------UBIGEO------------------------------------

    @Autowired
    private NegocioUbigeo negocioUbigeo;

    @Test
    void probarRegistrarUbigeo(){ // Registrar mas ubigeos  http://www.digemid.minsa.gob.pe/UpLoad/UpLoaded/PDF/distritos_disas(3).pdf
        Ubigeo ubigeo = new Ubigeo();
        ubigeo.setDepartamento("Lima");
        ubigeo.setDistrito("Lima");
        ubigeo.setProvincia("Lima");

        Ubigeo u = null;
        u = negocioUbigeo.registrarUbigeo(ubigeo);
        Assert.assertNotNull(u);
    }


    // -----------------------PENITENCIARIA------------------------------------

    @Autowired
    private NegocioPenitenciaria negocioPenitenciaria;

    @Test
    void probarRegistrarPenitenciaria(){ // Registrar mas ubigeos  http://www.digemid.minsa.gob.pe/UpLoad/UpLoaded/PDF/distritos_disas(3).pdf
        Penitenciaria penitenciaria = new Penitenciaria();
        penitenciaria.setDireccion("Av. Carretera Panamericana Norte Km39 - Ancón");
        penitenciaria.setNombre("Ancon I");
    // https://cdn.www.gob.pe/uploads/document/file/965548/Directorio_de_Establecimientos_Penitenciarios_a_Nivel_Nacional.pdf
        Ubigeo ubigeo = new Ubigeo();
        ubigeo.setId_ubigeo(1L);
        penitenciaria.setUbigeo(ubigeo);

        Penitenciaria p = null;
        p = negocioPenitenciaria.registrarPenitenciaria(penitenciaria);
        Assert.assertNotNull(p);
    }

    // -----------------------PROCESADO------------------------------------

    @Autowired
    private NegocioProcesado negocioProcesado;

    @Test
    void probarRegistrarProcesado(){
        Procesado procesado = new Procesado();

        procesado.setApellido_paterno("Atalaya");
        procesado.setApellido_materno("Pinedo");
        procesado.setDni("48448502");
        procesado.setFecha_nacimiento("16-06-1993");
        procesado.setNombres("Jean Carlos");
        procesado.setNombre_usuario("Jean");
        procesado.setSexo('M');

        Delito delito = new Delito();
        delito.setId_delito(1L);
        procesado.setDelito(delito);

        Penitenciaria penitenciaria = new Penitenciaria();
        penitenciaria.setId_penitenciaria(1L);
        procesado.setPenitenciaria(penitenciaria);

        Procesado p = null;
        p = negocioProcesado.RegistrarProcesado(procesado);
        Assert.assertNotNull(p);
    }

    // -----------------------JUEZ------------------------------------

    @Autowired
    private NegocioJuez negocioJuez;

    @Test
    void probarRegistrarJuez(){
        Juez juez = new Juez();

        juez.setApellido_paterno("Hurtado");
        juez.setApellido_materno("Reyes");
        juez.setDni("07355475");
        juez.setFecha_nacimiento("24-04-1970");
        juez.setNombres("Martín Alejandro");
        juez.setNombre_usuario("Jean");
        juez.setSexo('M');

        Juez j = null;
        j = negocioJuez.RegistrarJuez(juez);
        Assert.assertNotNull(j);
    }

    // https://lpderecho.pe/7-magistrados-jueces-fiscales-2017/
    // -----------------------ABOGADO------------------------------------

    // -----------------------ADMINISTRATIVO------------------------------------

    // -----------------------CORTE------------------------------------
    @Autowired
    private NegocioCorte negocioCorte;

    @Test
    void probarRegistrarCorte(){
        Corte corte = new Corte();
        corte.setDescripcion("Corte Superior de Lima");

        Corte c = new Corte();
        c = negocioCorte.RegistrarCorte(corte);
        Assert.assertNotNull(c);
    }

    // -----------------------Organo Jurisdiccional------------------------------------

    @Autowired
    private NegocioOrganoJurisdiccional negocioOrganoJurisdiccional;

    @Test
    void probarRegistrarOrganoJurisdiccional(){
        OrganoJurisdiccional orgJur = new OrganoJurisdiccional();

        orgJur.setNombre("Corte Suprema de Justicia de la Nación");
        orgJur.setDireccion("Cercado de Lima, Paseo de la República y las calles Miguel Aljovín y Manuel Cuadros.");

        Ubigeo ubigeo = new Ubigeo();
        ubigeo.setId_ubigeo(2L);
        orgJur.setUbigeo(ubigeo);

        Corte corte = new Corte();
        corte.setId_corte(1L);
        orgJur.setCorte(corte);

        OrganoJurisdiccional og = new OrganoJurisdiccional();
        og = negocioOrganoJurisdiccional.registrarOrganoJurisdiccional(orgJur);
        Assert.assertNotNull(og);
    }

    // -----------------------Tipo de Audiencia------------------------------------

    @Autowired
    private NegocioTipoAudiencia negocioTipoAudiencia;

    @Test
    void probarRegistrarTipoAudiencia(){
        TipoAudiencia tipoAudiencia = new TipoAudiencia();

        tipoAudiencia.setDescripcion("Presencial");

        TipoAudiencia ta = new TipoAudiencia();
        ta = negocioTipoAudiencia.registrarTipoAudiencia(tipoAudiencia);
        Assert.assertNotNull(ta);
    }

}
