<?php
	//echo "HOLA MUNDO";
	class Usuario{
		// propiedades o atributos
		private $nombre;
		private $codigo;
		private $telefono;
		
		// constructor
		public __construct($nombre, $codigo, $telefono){
			$this->nombre = $nombre;
			$this->codigo = $codigo;
			$this->telefono = $telefono;
		}
		
		//metodos get
		public getNombre(){
			return $this->nombre;
		}
		
		public getCodigo(){
			return $this->codigo;
		}
		
		public getTelefono(){
			return $this->telefono;
		}
		
		// metodos set
		public setNombre( $nom ){
			$this->nombre = $nom;
		}
		
		public setCodigo( $cod ) {
			$this->codigo = $cod;
		}
		
		public setTelefono( $tel ) {
			$this->telefono = $tel;
		}
	}
?>