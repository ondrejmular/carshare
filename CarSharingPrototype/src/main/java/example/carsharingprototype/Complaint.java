package example.carsharingprototype;


public class Complaint implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String idCar;
   private java.lang.String note;
   private java.lang.String driverName;
   private java.util.Date date;

   public Complaint()
   {
   }

   public java.lang.String getIdCar()
   {
      return this.idCar;
   }

   public void setIdCar(java.lang.String idCar)
   {
      this.idCar = idCar;
   }

   public java.lang.String getNote()
   {
      return this.note;
   }

   public void setNote(java.lang.String note)
   {
      this.note = note;
   }

   public java.lang.String getDriverName()
   {
      return this.driverName;
   }

   public void setDriverName(java.lang.String driverName)
   {
      this.driverName = driverName;
   }

   public java.util.Date getDate()
   {
      return this.date;
   }

   public void setDate(java.util.Date date)
   {
      this.date = date;
   }

   public Complaint(java.lang.String idCar, java.lang.String note,
         java.lang.String driverName, java.util.Date date)
   {
      this.idCar = idCar;
      this.note = note;
      this.driverName = driverName;
      this.date = date;
   }

}