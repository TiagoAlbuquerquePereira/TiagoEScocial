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

		Empresa a = new Empresa(null, "emprol", "9999999999", "MEI", 1, "999999", "Consultoria", "Tiago", "99999999999",
				"999999999");

		Empresa b = new Empresa(null, "EPNSocial", "9999999999", "IE", 2, "888888", "Serviços", "Tiago", "99999999999",
				"999999999");

		empresaRepository.saveAll(Arrays.asList(a, b));
	}

}
