package br.com.carsys.seed;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {

	

	@EventListener
    public void seed(ContextRefreshedEvent event) {
        seedTabelaCarros();
        //seedTabelaCompras();
        //seedtabelaVendas();
    }
	
	
	
	private void seedTabelaCarros() {
    /*    String dc0 = "Technology", dc1 = "General", dc2 = "Life";
        String sql = "SELECT category FROM categories c WHERE c.category IN (\"" + dc0 + "\", \"" + dc1 + "\", \"" + dc2 + "\")";
        List<Category> rs = jdbcTemplate.query(sql, (resultSet, rowNum) -> null);
        if(rs == null || rs.size() <= 0) {
            Category c = new Category("Technology");
            Category c2 = new Category("General");
            Category c3 = new Category("Life");
            categoryRepository.save(Arrays.asList(c, c2, c3));
            logger.info("category table seeded");
        }else {
            logger.trace("Category Seeding Not Required");
        }*/
    }
	
}
