package com.ws.insumak;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ws.insumak.model.TestTable;

@SpringBootApplication
public class InsumakApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(InsumakApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        String sql = "SELECT id, opis FROM qbemkd.testapex_tb1";
         
        List<TestTable> tableData = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(TestTable.class));
         
		for (int i = 0; i < tableData.size(); i++) {
			System.out.println("ID: " + tableData.get(i).getID() + ", OPIS: " + tableData.get(i).getOpis());
		}
    }
}
