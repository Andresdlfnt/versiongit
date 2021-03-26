package ut5_6_cuenta;
/**
 * 
 * @author Andres de la Fuente Hurtado
 * @version 1.0
 */
public class Cuenta {
		
		private String nombrecliente;
		private String ncuenta;
		private double tipointeres;
		private double saldo;
		public Cuenta() {
			nombrecliente="";
			ncuenta="";
			tipointeres=0;
			saldo=0;
		}
		
		public Cuenta(String nombrecliente, String ncuenta, double tipointeres, double saldo) {
			this.nombrecliente=nombrecliente;
			this.ncuenta=ncuenta;
			this.tipointeres=tipointeres;
			this.saldo=saldo;
		}
		
		public Cuenta(Cuenta a) {
			this.nombrecliente=a.nombrecliente;
			this.ncuenta=a.ncuenta;
			this.tipointeres=a.tipointeres;
			this.saldo=a.saldo;
			
		}
		public void setNombre(String nombre) {
			this.nombrecliente=nombre;
		}
		public void setNumeroCuenta(String numero) {
			this.ncuenta=numero;
		}
		public void setTipoInteres(double tipo) {
			this.tipointeres=tipo;
		}
		public void setSaldo(double importe) {
			this.saldo=importe;
		}
		public String getNombre() {
			return nombrecliente;
		}
		public String getNumeroCuenta() {
			return ncuenta;
		}
		public double getTipoInteres() {
			return tipointeres;
		}
		public double getSaldo() {
			return saldo;
		}

		
		public boolean ingreso(double ingreso) {
			if (ingreso>=0) {
				this.saldo+=ingreso;
				return true;
			} else {
				return false;
			}
		}
		
		public boolean reintegro(double reintegro) {
			if (reintegro>=0) {
				if (this.saldo>=reintegro) {
				this.saldo-=reintegro;
				return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		
		public boolean transferencia(Cuenta destino,double importe) {
			if (reintegro(importe)) {
				destino.ingreso(importe);
				return true;
			} else {
				return false;
			}
		}
}