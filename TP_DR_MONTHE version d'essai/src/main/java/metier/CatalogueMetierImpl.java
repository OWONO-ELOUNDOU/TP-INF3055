package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CatalogueMetierImpl implements ICatalogueMetier{

	@Override
	public void addProduit(Produit p) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO produits(ref_prod,designation,prix,quantite) values(?,?,?,?)");
			ps.setString(1, p.getReference());
			ps.setString(2, p.getDesignation());
			ps.setDouble(3, p.getPrix());
			ps.setInt(4, p.getQuantite());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Produit> listProduits() {
		List<Produit> prods = new ArrayList<Produit>();
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM produits");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit p = new Produit();
				p.setReference(rs.getString("ref_prod"));
				p.setDesignation(rs.getString("designation"));
				p.setPrix(rs.getDouble("prix"));
				p.setQuantite(rs.getInt("quantite"));
				prods.add(p);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public List<Produit> produitsParMotCle(String motCle) {
		List<Produit> prods = new ArrayList<Produit>();
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM produits where designation like ?");
			ps.setString(1, "%" + motCle + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit p = new Produit();
				p.setReference(rs.getString("ref_prod"));
				p.setDesignation(rs.getString("designation"));
				p.setPrix(rs.getDouble("prix"));
				p.setQuantite(rs.getInt("quantite"));
				prods.add(p);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public Produit getProduit(String ref) {
		Produit p = null;
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM produits WHERE ref_prod = ?");
			ps.setString(1, ref);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				p = new Produit();
				p.setReference(rs.getString("ref_prod"));
				p.setDesignation(rs.getString("designation"));
				p.setPrix(rs.getDouble("prix"));
				p.setQuantite(rs.getInt("quantite"));
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(p == null) {
			throw new RuntimeException("le produit" + ref + "est introuvable");
		}
		return p;
	}

	@Override
	public void updateProduit(Produit p) {  
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("UPDATE produits SET designation = ?, prix = ?, quantite = ? WHERE ref_prod = ?");
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			ps.setString(4, p.getReference());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduit(String ref) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("DELETE from produits WHERE ref_prod = ?");
			ps.setString(1, ref);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
