package java0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

//select, insert, update, delete sql�� ���� ���

public class ActorDao {
	
	List<ActorVo> getActors(){
		
		List<ActorVo> list = new ArrayList<>();
		
		// DB��������
		String url = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		
		// SELECT�� ���࿡ �ʿ��� JDBC��ü 3����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		String sql="";
		//1�ܰ�
		try {
			//1�ܰ�. DB����̹� Ŭ���� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2�ܰ�. DB�� ���� �õ�. ������ Connection��ü�� ������.
			con = DriverManager.getConnection(url, dbId, dbPwd );//�α��� �õ� (db����)
			
			// 3�ܰ� SQL���尴ü �غ�
			sql ="SELECT * FROM actor ORDER BY actor_id DESC";
			pstmt = con.prepareStatement(sql);
			
			
			//select�� ������ select����� ResultSet���� ����.
			rs = pstmt.executeQuery();//SELECT�� ����� ȣ����.
			
			//4�ܰ�. ResultSet������ ������  ���
			while(rs.next()/*���������� ȭ��ǥ ��ü�� �ٸ��ٷ� �̵���Ű�� ����*/) {
				
				ActorVo actorVo = new ActorVo();
				
				actorVo.setActorId(rs.getInt("actor_id"));
				actorVo.setFirstName(rs.getString("first_name"));
				actorVo.setLastName(rs.getString("last_name"));
				actorVo.setLastUpdate(rs.getTimestamp("last_update"));
				
				list.add(actorVo);

			}//while
		
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}		
		return list;
	}//getActors �޼ҵ�
	
	
	
	public ActorVo getActorById(int actorId){
		ActorVo actorVo = null;
		
		// DB��������
		String url = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		
		// SELECT�� ���࿡ �ʿ��� JDBC��ü 3����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		String sql="";
		//1�ܰ�
		try {
			//1�ܰ�. DB����̹� Ŭ���� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2�ܰ�. DB�� ���� �õ�. ������ Connection��ü�� ������.
			con = DriverManager.getConnection(url, dbId, dbPwd );//�α��� �õ� (db����)
			
			// 3�ܰ� SQL���尴ü �غ�
			sql ="SELECT * FROM actor WHERE actor_id = ?";
			pstmt = con.prepareStatement(sql);		
			pstmt.setInt(1, actorId);
			
			//select�� ������ select����� ResultSet���� ����.
			rs = pstmt.executeQuery();//SELECT�� ����� ȣ����.
			
			//4�ܰ�. ResultSet������ ������  ���
			if (rs.next()/*���������� ȭ��ǥ ��ü�� �ٸ��ٷ� �̵���Ű�� ����*/) { //�÷��� �⺻Ű�϶��� if��밡�� 
				
				actorVo = new ActorVo();//ActorVo��ü ����				
				actorVo.setActorId(rs.getInt("actor_id"));
				actorVo.setFirstName(rs.getString("first_name"));
				actorVo.setLastName(rs.getString("last_name"));
				actorVo.setLastUpdate(rs.getTimestamp("last_update"));
				
			}//while
		
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}		

		return actorVo;
	}		
	
	public static void main(String[] args) {
		
		ActorDao actorDao= new ActorDao();
		
		List<ActorVo> list = actorDao.getActors();
		
		for( ActorVo actorVo: list) {
			System.out.println(actorVo.toString());
		}
		
		System.out.println("����� ���� :" + list.size());
		
		System.out.println("=======================");
		
		ActorVo actorVo1 = actorDao.getActorById(204);
		System.out.println("actorVo1 : " + actorVo1);
		
		ActorVo actorVo2 = actorDao.getActorById(205);
		System.out.println("actorVo1 : " + actorVo2);
				
		if(actorVo2 == null) {
			
		}else {// actorVo2 != null
			
		}
		
	}// main
	
	
}// ActorDao



