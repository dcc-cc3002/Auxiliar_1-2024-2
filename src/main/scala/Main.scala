object Main {
  def main(args: Array[String]): Unit = {
    PrimeraAuxiliarMemera()
    pruebaAux()
    val m0: Moto = new Moto(100, 0)
    val a0: Auto = new Auto(400, 50)
    def avanzarMucho(v: Avanzar): Unit ={
      v.avanzar(100)
    }
    println(m0)
    avanzarMucho(m0)
    println(m0)
    
  }
  def PrimeraAuxiliarMemera(): Unit ={
    println("Hola memeros")
  }
  def pruebaAux(): Unit ={
    println("Where are the memes?")
    
  }
}