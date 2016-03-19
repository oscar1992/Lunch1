/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lunch.enpoint;

import co.com.lunch.logic.admin.InformacionNutricionalLogic;
import co.com.lunch.persistencia.admin.InformacionNutricionalEntity;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author oscarramirez
 */
@WebService(serviceName = "adminEndpoint")
public class adminEndpoint {

    
    /**
     * Método que permite insertar un registro de la Información nutricional
     * @param info
     * @return 
     */
    @WebMethod
    public InformacionNutricionalEntity ingresaInformacionNutricionalEntity(@WebParam(name = "info")InformacionNutricionalEntity info){
        InformacionNutricionalEntity infoRetorna=null;
        try{
            InformacionNutricionalLogic logic=new InformacionNutricionalLogic();
            infoRetorna=logic.ingresaInformacionNutricional(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la información Nutricional
     * @param info
     * @return 
     */
    @WebMethod
    public InformacionNutricionalEntity actualizaInformacionNutricionalEntity(@WebParam(name = "info")InformacionNutricionalEntity info){
        InformacionNutricionalEntity infoRetorna=null;
        try{
            InformacionNutricionalLogic logic=new InformacionNutricionalLogic();
            infoRetorna=logic.actualizaInformacionNutricional(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    @WebMethod
    public ArrayList<InformacionNutricionalEntity> listaInformacionNutricionalEntity(){
        ArrayList<InformacionNutricionalEntity> infoRetorna=null;
        try{
            InformacionNutricionalLogic logic=new InformacionNutricionalLogic();
            infoRetorna=logic.listaInformacionNutricional();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	
	/**
     * Método que permite insertar un registro de la Caja Predeterminada
     * @param info
     * @return 
     */
    @WebMethod
    public CajaPredeterminadaEntity ingresaCajaPredeterminadaEntity(@WebParam(name = "info")CajaPredeterminadaEntity info){
        CajaPredeterminadaEntity infoRetorna=null;
        try{
            CajaPredeterminadaLogic logic=new CajaPredeterminadaLogic();
            infoRetorna=logic.ingresaCajaPredeterminada(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la Caja Predeterminada
     * @param info
     * @return 
     */
    public CajaPredeterminadaEntity actualizaCajaPredeterminadaEntity(@WebParam(name = "info")CajaPredeterminadaEntity info){
        CajaPredeterminadaEntity infoRetorna=null;
        try{
            CajaPredeterminadaLogic logic=new CajaPredeterminadaLogic();
            infoRetorna=logic.actualizaCajaPredeterminada(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<CajaPredeterminadaEntity> listaCajaPredeterminadaEntity(){
        ArrayList<CajaPredeterminadaEntity> infoRetorna=null;
        try{
            CajaPredeterminadaLogic logic=new CajaPredeterminadaLogic();
            infoRetorna=logic.listaCajaPredeterminada();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	
	/**
     * Método que permite insertar un registro de la Categoria
     * @param info
     * @return 
     */
    @WebMethod
    public CategoriaEntity ingresaCategoriaEntity(@WebParam(name = "info")CategoriaEntity info){
        CategoriaEntity infoRetorna=null;
        try{
            CategoriaLogic logic=new CategoriaLogic();
            infoRetorna=logic.ingresaCategoria(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la Categoria
     * @param info
     * @return 
     */
    public CategoriaEntity actualizaCategoriaEntity(@WebParam(name = "info")CategoriaEntity info){
        CategoriaEntity infoRetorna=null;
        try{
            CategoriaLogic logic=new CategoriaLogic();
            infoRetorna=logic.actualizaCategoria(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<CategoriaEntity> listaCategoriaEntity(){
        ArrayList<CategoriaEntity> infoRetorna=null;
        try{
            CategoriaLogic logic=new CategoriaLogic();
            infoRetorna=logic.listaCategoria();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	/**
     * Método que permite insertar un registro de la Combinaciones
     * @param info
     * @return 
     */
    @WebMethod
    public CombinacionesEntity ingresaCombinacionesEntity(@WebParam(name = "info")CombinacionesEntity info){
        CombinacionesEntity infoRetorna=null;
        try{
            CombinacionesLogic logic=new CombinacionesLogic();
            infoRetorna=logic.ingresaCombinaciones(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la Combinaciones
     * @param info
     * @return 
     */
    public CombinacionesEntity actualizaCombinacionesEntity(@WebParam(name = "info")CombinacionesEntity info){
        CombinacionesEntity infoRetorna=null;
        try{
            CombinacionesLogic logic=new CombinacionesLogic();
            infoRetorna=logic.actualizaCombinaciones(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<CombinacionesEntity> listaCombinacionesEntity(){
        ArrayList<CombinacionesEntity> infoRetorna=null;
        try{
            CombinacionesLogic logic=new CombinacionesLogic();
            infoRetorna=logic.listaCombinaciones();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	
	/**
     * Método que permite insertar un registro de la Grupo Alimenticio
     * @param info
     * @return 
     */
    @WebMethod
    public GrupoAlimenticioEntity ingresaGrupoAlimenticioEntity(@WebParam(name = "info")GrupoAlimenticioEntity info){
        GrupoAlimenticioEntity infoRetorna=null;
        try{
            GrupoAlimenticioLogic logic=new GrupoAlimenticioLogic();
            infoRetorna=logic.ingresaGrupoAlimenticio(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la Grupo Alimenticio
     * @param info
     * @return 
     */
    public GrupoAlimenticioEntity actualizaGrupoAlimenticioEntity(@WebParam(name = "info")GrupoAlimenticioEntity info){
        GrupoAlimenticioEntity infoRetorna=null;
        try{
            GrupoAlimenticioLogic logic=new GrupoAlimenticioLogic();
            infoRetorna=logic.actualizaGrupoAlimenticio(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<GrupoAlimenticioEntity> listaGrupoAlimenticioEntity(){
        ArrayList<GrupoAlimenticioEntity> infoRetorna=null;
        try{
            GrupoAlimenticioLogic logic=new GrupoAlimenticioLogic();
            infoRetorna=logic.listaGrupoAlimenticio();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	/**
     * Método que permite insertar un registro de la Grupo_Alimenticio_Producto
     * @param info
     * @return 
     */
    @WebMethod
    public GrupoAlimenticioProductoEntity ingresaGrupoAlimenticioProductoEntity(@WebParam(name = "info")GrupoAlimenticioProductoEntity info){
        GrupoAlimenticioProductoEntity infoRetorna=null;
        try{
            GrupoAlimenticioProductoLogic logic=new GrupoAlimenticioProductoLogic();
            infoRetorna=logic.ingresaGrupoAlimenticioProducto(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la Grupo_Alimenticio_Producto
     * @param info
     * @return 
     */
    public GrupoAlimenticioProductoEntity actualizaGrupoAlimenticioProductoEntity(@WebParam(name = "info")GrupoAlimenticioProductoEntity info){
        GrupoAlimenticioProductoEntity infoRetorna=null;
        try{
            GrupoAlimenticioProductoLogic logic=new GrupoAlimenticioProductoLogic();
            infoRetorna=logic.actualizaGrupoAlimenticioProducto(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<GrupoAlimenticioProductoEntity> listaGrupoAlimenticioProductoEntity(){
        ArrayList<GrupoAlimenticioProductoEntity> infoRetorna=null;
        try{
            GrupoAlimenticioProductoLogic logic=new GrupoAlimenticioProductoLogic();
            infoRetorna=logic.listaGrupoAlimenticioProducto();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	
	/**
     * Método que permite insertar un registro de la InformacionNutricional
     * @param info
     * @return 
     */
    @WebMethod
    public InformacionNutricionalEntity ingresaInformacionNutricionalEntity(@WebParam(name = "info")InformacionNutricionalEntity info){
        InformacionNutricionalEntity infoRetorna=null;
        try{
            InformacionNutricionalLogic logic=new InformacionNutricionalLogic();
            infoRetorna=logic.ingresaInformacionNutricional(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la InformacionNutricional
     * @param info
     * @return 
     */
    public InformacionNutricionalEntity actualizaInformacionNutricionalEntity(@WebParam(name = "info")InformacionNutricionalEntity info){
        InformacionNutricionalEntity infoRetorna=null;
        try{
            InformacionNutricionalLogic logic=new InformacionNutricionalLogic();
            infoRetorna=logic.actualizaInformacionNutricional(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<InformacionNutricionalEntity> listaInformacionNutricionalEntity(){
        ArrayList<InformacionNutricionalEntity> infoRetorna=null;
        try{
            InformacionNutricionalLogic logic=new InformacionNutricionalLogic();
            infoRetorna=logic.listaInformacionNutricional();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	
	/**
     * Método que permite insertar un registro de la Item
     * @param info
     * @return 
     */
    @WebMethod
    public ItemEntity ingresaItemEntity(@WebParam(name = "info")ItemEntity info){
        ItemEntity infoRetorna=null;
        try{
            ItemLogic logic=new ItemLogic();
            infoRetorna=logic.ingresaItem(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la Item
     * @param info
     * @return 
     */
    public ItemEntity actualizaItemEntity(@WebParam(name = "info")ItemEntity info){
        ItemEntity infoRetorna=null;
        try{
            ItemLogic logic=new ItemLogic();
            infoRetorna=logic.actualizaItem(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<ItemEntity> listaItemEntity(){
        ArrayList<ItemEntity> infoRetorna=null;
        try{
            ItemLogic logic=new ItemLogic();
            infoRetorna=logic.listaItem();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	
	/**
     * Método que permite insertar un registro de la Marca
     * @param info
     * @return 
     */
    @WebMethod
    public MarcaEntity ingresaMarcaEntity(@WebParam(name = "info")MarcaEntity info){
        MarcaEntity infoRetorna=null;
        try{
            MarcaLogic logic=new MarcaLogic();
            infoRetorna=logic.ingresaMarca(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la Marca
     * @param info
     * @return 
     */
    public MarcaEntity actualizaMarcaEntity(@WebParam(name = "info")MarcaEntity info){
        MarcaEntity infoRetorna=null;
        try{
            MarcaLogic logic=new MarcaLogic();
            infoRetorna=logic.actualizaMarca(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<MarcaEntity> listaMarcaEntity(){
        ArrayList<MarcaEntity> infoRetorna=null;
        try{
            MarcaLogic logic=new MarcaLogic();
            infoRetorna=logic.listaMarca();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
	
	/**
     * Método que permite insertar un registro de la Producto
     * @param info
     * @return 
     */
    @WebMethod
    public ProductoEntity ingresaProductoEntity(@WebParam(name = "info")ProductoEntity info){
        ProductoEntity infoRetorna=null;
        try{
            ProductoLogic logic=new ProductoLogic();
            infoRetorna=logic.ingresaProducto(info);
        }catch(Exception e){
            System.out.println("ERROR en la inserción del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que permite actualizar un registro de la Producto
     * @param info
     * @return 
     */
    public ProductoEntity actualizaProductoEntity(@WebParam(name = "info")ProductoEntity info){
        ProductoEntity infoRetorna=null;
        try{
            ProductoLogic logic=new ProductoLogic();
            infoRetorna=logic.actualizaProducto(info);
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
    /**
     * Método que trae toda la lista de las informaciones nutricionales
     * @return 
     */
    public ArrayList<ProductoEntity> listaProductoEntity(){
        ArrayList<ProductoEntity> infoRetorna=null;
        try{
            ProductoLogic logic=new ProductoLogic();
            infoRetorna=logic.listaProducto();
        }catch(Exception e){
            System.out.println("ERROR en la actualización del webservice");
        }
        return infoRetorna;
    }
}
