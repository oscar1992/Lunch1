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