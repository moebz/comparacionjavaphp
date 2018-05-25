class Usuario {
    
    // propiedades o atributos
    private String nombre;
    private int codigo;
    private String telefono;
    
    // constructor
    public Usuario() {
        this.nombre = "Desconocido";
        this.codigo = 0;
        this.telefono = "0";
    }
    
    // constructor
    public Usuario(String nom, int cod, String tel) {
        this.nombre = nom;
        this.codigo = cod;
        this.telefono = tel;
    }
    
    // metodos get
    public String getNombre() {
        return this.nombre;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    // metodos set
    public void setNombre( String nom ) {
        this.nombre = nom;
    }
    
    public void setCodigo( int codigo ) {
        this.codigo = cod;
    }
    
    public void setTelefono( String tel ) {
        this.telefono = tel;
    }
    
}