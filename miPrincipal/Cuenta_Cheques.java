package miPrincipal;

public class Cuenta_Cheques {
   //coloca el codigo faltante
    private String nombreCuenta;
    private String nombreCliente;
    private String sucursal;
    private float saldo;


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
   public void setSaldo(float saldo) {
      this.saldo = saldo;
   }
   public Cuenta_Cheques() 
   {

   }

   public float getSaldo()
   {
      return saldo;
   }

   public float deposito(float cadena)
{
 //pendiente
 return 0.0f;
}

public float retiro(float cadena)
{
   //pendiente
 return 0.0f;
}
public float muestra_saldo()
{
 //pendiente
 return 0.0f;
}


   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal) {
      this.nombreCuenta = nombreCuenta;
      this.nombreCliente = nombreCliente;
      this.sucursal = sucursal;
   }

   

   

    
    
}
