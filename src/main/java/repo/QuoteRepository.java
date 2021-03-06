package repo;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import model.Quote;

import org.springframework.jdbc.core.JdbcTemplate;

public class QuoteRepository {
	
	private JdbcTemplate jdbc;
    
	
	public QuoteRepository(DataSource ds) {
		this.jdbc = new JdbcTemplate(ds);
	}
	
	/**
	 * Stores Quote into a database
	 * @param q - Quote to be stored
	 */
	public void add(Quote q) {
		  this.jdbc.update(
		    "insert into quote values ('" + q.getQuote() +"', '" +q.getAttributedTo()+ "')"
		  );
		 }

	/**
	 * Returns a list of all Quotes contained in database
	 * RowMapper returns each row and maps it to an object that is placed in a list
	 * @return List of Quotes
	 */
	public List<Quote> findAll(){
		
		//jdbc.query() returns a list of Quotes
		return this.jdbc.query(
				"select * from quote",
				//lambda expression - equivalent of what is commented out below
				//RowMapper maps db rows with object fields and returns an object
				(ResultSet rs, int rowNum) -> { return new Quote(rs.getString("quote"), rs.getString("attributedTo")); }
								
//				new RowMapper<Quote>(){
//					@Override
//					public Quote mapRow(ResultSet rs, int rowNum)throws SQLException {
//						Quote q = new Quote(rs.getString("quote"), rs.getString("attributedTo"));
//						return q;
//					}
//				}
				
				);		
	}
	

}
