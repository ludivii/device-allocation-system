package com.luandias.device_allocation_system.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.luandias.device_allocation_system.entities.Address;
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
		
		Address address1 = new Address(null, "Rua 1", "Bahia", "Camaçari", "11111-111", "+55 (71) 1111-1111");
		Address address2 = new Address(null, "Rua 2", "São Paulo", "São Paulo", "22222-222", "+55 (16) 2222-2222");
		Address address3 = new Address(null, "Rua 3", "Bahia", "Vitoria da Conquista", "33333-333", "+55 (77) 3333-3333");
		Address address4 = new Address(null, "Rua 4", "Maranhão", "São Luis", "44444-444", "+55 (98) 4444-4444");
		Address address5 = new Address(null, "Rua 5", "Pernambuco", "Recife", "55555-555", "+55 (81) 5555-5555");
		Address address6 = new Address(null, "Rua 6", "Amazonas", "Manaus", "66666-666", "+55 (92) 6666-6666");
		Address address7 = new Address(null, "Rua 7", "Distrito Federal", "Brasilia", "77777-777", "+55 (61) 7777-7777");
		Address address8 = new Address(null, "Rua 8", "Ceará", "Fortaleza", "88888-888", "+55 (85) 8888-8888");
		Address address9 = new Address(null, "Rua 9", "Minas Gerais", "Belo Horizonte", "99999-999", "+55 (31) 9999-9999");
		Address address10 = new Address(null, "Rua 10", "Rio Grande do Sul", "Porto Alegre", "10101-010", "+55 (51) 1010-1010");
		
		addressRepository.saveAll(Arrays.asList(address1, address2, address3, address4, address5, address6, address7, address8, address9, address10));

		clientRepository.deleteAll();
		
		Client client1 = new Client(null, "Luan", "Vinhático", LocalDate.of(2002, 2, 17), 'M', address1);
		Client client2 = new Client(null, "Pedro", "Santos", LocalDate.of(1998, 8, 20), 'M', address2);
		Client client3 = new Client(null, "Italo", "Menezes", LocalDate.of(1988, 10, 01), 'M', address3);
		Client client4 = new Client(null, "Levi", "Araujo", LocalDate.of(1994, 5, 04), 'M', address4);
		Client client5 = new Client(null, "Jorge", "Passos", LocalDate.of(1982, 2, 21), 'M', address5);
		
		clientRepository.saveAll(Arrays.asList(client1, client2, client3, client4, client5));
		
		
	}

}
