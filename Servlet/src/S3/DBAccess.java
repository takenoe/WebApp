package S3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DBAccess {

	public int inser(String s1,String s2){
		int cont = 0;
		PreparedStatement pstm = null;
		Connection connection = null;
		String sql = "INSERT INTO login (name ,pass) VALUES(?,?)";
		try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root"); //password;

				pstm = connection.prepareStatement(sql);
				pstm.setString(1, s1);
				pstm.setString(2, s2);
				int cnt = pstm.executeUpdate();
				if (cnt == 1) {
					cont ++;

	            }
				}catch (SQLException e) {
                    // データベース操作に関するエラー情報取得
                    System.out.println("エラー番号：" + e.getErrorCode());
                    System.out.println("説明：" + e.getMessage());

                } catch (Exception e) {
                    System.out.println("その他のエラー：" + e.getMessage());

                } finally {
                    // データベース操作に関する後処理
                    try {
                        if (pstm != null) {
                            pstm.close();
                        }
                        if (connection != null) {
                        	connection.close();
                        }
                    }catch (SQLException e) {
                        System.out.println("クローズエラー：" + e.getMessage());
                    }
                }
		return cont;
	}
}
