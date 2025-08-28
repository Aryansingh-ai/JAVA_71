public class MyException {
    public static void main(String[] args) {
            UserDefinedException udf = new UserDefinedException();
            try
            {

                udf.validate(52);
                udf.validate(12); // yha exception aagyi to neeche gya hi nhi
                udf.validate(18);

            }
            catch(InvalidAgeException e){
                System.out.println(e.getMessage());
            }
            
    }
}
