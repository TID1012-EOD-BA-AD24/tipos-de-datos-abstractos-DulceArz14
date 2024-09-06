package miPrincipal;

public class Cuenta_Cheques {
   //coloca el codigo faltante
   private String nombreCuenta;
   private String nombreCliente;
   private String sucursal;
   private float saldo;
   public Cuenta_Cheques() {
   }
   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal, float saldo) {
      this.nombreCuenta = nombreCuenta;
      this.nombreCliente = nombreCliente;
      this.sucursal = sucursal;
      this.saldo = saldo;
   }
   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal) {
      this.nombreCuenta = nombreCuenta;
      this.nombreCliente = nombreCliente;
      this.sucursal = sucursal;
   }
   public String getNombreCuenta() {
      return nombreCuenta;
   }
   public void setNombreCuenta(String nombreCuenta) {
      this.nombreCuenta = nombreCuenta;
   }
   public String getNombreCliente() {
      return nombreCliente;
   }
   public void setNombreCliente(String nombreCliente) {
      this.nombreCliente = nombreCliente;
   }
   public String getSucursal() {
      return sucursal;
   }
   public void setSucursal(String sucursal) {
      this.sucursal = sucursal;
   }

   public float getSaldo() {
      return saldo;
   }

  

   public float deposito(float cadena){
      //pendiente
      if (cadena > 0) {
         this.saldo += cadena;
     }
     return this.saldo;

   }
   public float retiro(float cadena){
      //pendiente
      if (cadena > 0 && cadena <= this.saldo) {
         this.saldo -= cadena;
     }
     return this.saldo;

   }
   public float muestra_saldo(){ 
      //pendiente
      return this.saldo;


   }  
}
