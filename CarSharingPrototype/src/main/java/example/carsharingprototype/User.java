package example.carsharingprototype;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class User implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "USER_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "USER_ID_SEQ", name = "USER_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("First name")
   private java.lang.String firstName;

   @org.kie.api.definition.type.Label("Last name")
   private java.lang.String lastName;

   @org.kie.api.definition.type.Label("Email address")
   private java.lang.String emailAddress;

   @org.kie.api.definition.type.Label("Password")
   private java.lang.String password;

   @org.kie.api.definition.type.Label(value = "Is verified")
   private boolean isVerified;

   @org.kie.api.definition.type.Label(value = "Is activated")
   private boolean isActivated;

   @javax.persistence.OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   @org.kie.api.definition.type.Label(value = "Payment cards")
   private java.util.List<example.carsharingprototype.PaymentCard> cards;

   private java.lang.String idCardUri;

   public User()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.lang.String getEmailAddress()
   {
      return this.emailAddress;
   }

   public void setEmailAddress(java.lang.String emailAddress)
   {
      this.emailAddress = emailAddress;
   }

   public java.lang.String getPassword()
   {
      return this.password;
   }

   public void setPassword(java.lang.String password)
   {
      this.password = password;
   }

   public boolean isIsVerified()
   {
      return this.isVerified;
   }

   public void setIsVerified(boolean isVerified)
   {
      this.isVerified = isVerified;
   }

   public boolean isIsActivated()
   {
      return this.isActivated;
   }

   public void setIsActivated(boolean isActivated)
   {
      this.isActivated = isActivated;
   }

   public java.util.List<example.carsharingprototype.PaymentCard> getCards()
   {
      return this.cards;
   }

   public void setCards(
         java.util.List<example.carsharingprototype.PaymentCard> cards)
   {
      this.cards = cards;
   }

   public java.lang.String getIdCardUri()
   {
      return this.idCardUri;
   }

   public void setIdCardUri(java.lang.String idCardUri)
   {
      this.idCardUri = idCardUri;
   }
   
   @Override
   public String toString() {
       return "User(email=" + this.emailAddress + ")";
   }

   public User(java.lang.Long id, java.lang.String firstName,
         java.lang.String lastName, java.lang.String emailAddress,
         java.lang.String password, boolean isVerified, boolean isActivated,
         java.util.List<example.carsharingprototype.PaymentCard> cards,
         java.lang.String idCardUri)
   {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.emailAddress = emailAddress;
      this.password = password;
      this.isVerified = isVerified;
      this.isActivated = isActivated;
      this.cards = cards;
      this.idCardUri = idCardUri;
   }

}