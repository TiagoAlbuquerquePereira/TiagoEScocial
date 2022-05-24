package com.Esocial.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Esocial.entidades.Empresa;
import com.Esocial.repositories.EmpresaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public void run(String... args) throws Exception {

		Empresa a = new Empresa(null, "Emprol", "999999/00001-99", "MEI", 1, "1031-10", "Consultoria");
		Empresa b = new Empresa(null, "Empresa2", "888888/00001-99", "IE", 3, "9991-10", "Construcao civil");
		

		empresaRepository.saveAll(Arrays.asList(a, b));
	}

}
