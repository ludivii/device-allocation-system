package com.luandias.device_allocation_system.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.luandias.device_allocation_system.entities.Address;
import com.luandias.device_allocation_system.entities.Business;
import com.luandias.device_allocation_system.entities.Client;
import com.luandias.device_allocation_system.repositories.AddressRepository;
import com.luandias.device_allocation_system.repositories.AllocationRepository;
import com.luandias.device_allocation_system.repositories.BusinessRepository;
import com.luandias.device_allocation_system.repositories.ClientRepository;
import com.luandias.device_allocation_system.repositories.DeviceRepository;
import com.luandias.device_allocation_system.repositories.MonitorRepository;
import com.luandias.device_allocation_system.repositories.StabilizerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private AllocationRepository allocationRepository;
	@Autowired
	private BusinessRepository businessRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private DeviceRepository deviceRepository;
	@Autowired
	private MonitorRepository monitorRepository;
	@Autowired
	private StabilizerRepository stabilizerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO: Seed all tables
		
		addressRepository.deleteAll();
		
		Address address1 = new Address(null, "Rua Gonçalves Cezimbra","Pituaçu", "Bahia", "Salvador", "41741-155");
		Address address2 = new Address(null, "Rua Elísia Gonçalves Barselos", "Vila Brasília (Zona Sul)", "São Paulo", "São Paulo", "04845-280");
		Address address3 = new Address(null, "Via Local", "Zabelê", "Bahia", "Vitoria da Conquista", "45077-068");
		Address address4 = new Address(null, "Travessa da Estrela", "Vila Primavera", "Maranhão", "São Luis", "65043-880");
		Address address5 = new Address(null, "3ª Travessa da Floresta", "Santo Amaro", "Pernambuco", "Recife", "50110-224");
		Address address6 = new Address(null, "Rua José Cidade", "Parque 10 de Novembro","Amazonas", "Manaus", "69054-380");
		Address address7 = new Address(null, "Quadra AR 12 Conjunto 5", "Setor Oeste (Sobradinho II)","Distrito Federal", "Brasilia", "73062-205");
		Address address8 = new Address(null, "Alameda Chico Xavier", "Passaré","Ceará", "Fortaleza", "60868-208");
		Address address9 = new Address(null, "Rua Branca Raso Assunção", "Itapoã","Minas Gerais", "Belo Horizonte", "31710-060");
		Address address10 = new Address(null, "Rua Oito", "Santana","Rio Grande do Sul", "Porto Alegre", "90040-253");
		
		addressRepository.saveAll(Arrays.asList(address1, address2, address3, address4, address5, address6, address7, address8, address9, address10));

		clientRepository.deleteAll();
		
		Client client1 = new Client(null, "Luan", "Vinhático", LocalDate.of(2002, 2, 17), 'M', "+55 (71) 3766-9931", address1);
		Client client2 = new Client(null, "Pedro", "Santos", LocalDate.of(1998, 8, 20), 'M', "+55 (16) 3954-3114", address2);
		Client client3 = new Client(null, "Italo", "Menezes", LocalDate.of(1988, 10, 01), 'M', "+55 (77) 3666-5859", address3);
		Client client4 = new Client(null, "Levi", "Araujo", LocalDate.of(1994, 5, 04), 'M', "+55 (98) 3243-1717", address4);
		Client client5 = new Client(null, "Jorge", "Passos", LocalDate.of(1982, 2, 21), 'M', "+55 (81) 2553-1382", address5);
		
		clientRepository.saveAll(Arrays.asList(client1, client2, client3, client4, client5));
		
		businessRepository.deleteAll();
		
		Business business1 = new Business(null, "Dominalog", "62.092.592/0001-76", "+55 (92) 2229-6301", "dominalog@test.com.br", address6);
		Business business2 = new Business(null, "Infoplem", "61.940.640/0001-76", "+55 (61) 2531-1753", "infoplem@test.com.br", address7);
		Business business3 = new Business(null, "LVM", "04.670.534/0001-86", "+55 (85) 3634-1063", "lvm@test.com.br", address8);
		Business business4 = new Business(null, "InfoTech", "23.685.674/0001-72", "+55 (31) 3122-2817", "infotech@test.com.br", address9);
		Business business5 = new Business(null, "CarDealership", "06.140.899/0001-24", "+55 (51) 3067-6227", "cardealership@test.com.br", address10);
		
		businessRepository.saveAll(Arrays.asList(business1, business2, business3, business4, business5));
		
		
	}

}
