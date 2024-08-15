trait Avanzar{
  def avanzar(km: Int): Unit
}

class Moto(private var bencina: Int, private var km: Int) extends Avanzar {
  def avanzar(dist: Int): Unit = {
    if(dist > bencina){
      println("There is no enough gas")
    }else{
      km += dist
      bencina -= dist
    }
  }

  override def toString(): String = s"Tiene ${bencina} litros de bencina y ha andado ${km} kilometros"


}

class Auto(private var bencina: Int, private var km: Int){
  def avanzar(dist: Int): Unit = {
    if (dist > bencina) {
      println("There is no enoguh gas")
    } else {
      km += dist
      bencina -= dist
    }
  }

}