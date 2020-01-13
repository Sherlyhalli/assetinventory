package com.itaim.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itaim.application.domain.Client;
import com.itaim.application.repository.ClientRepository;
import com.itaim.application.service.ClientService;

@Service
@Transactional
public class ClientServiceImpl implements ClientService 
{
	private static final Logger logger = LoggerFactory.getLogger(ClientServiceImpl.class);

	@Autowired
	ClientRepository clientRepository;
	
	public String saveClient(Client client) 
	{
		logger.info("request for save data in client{}",client);
		clientRepository.save(client);
		return "The client has been saved successfully.";
	}

	public List<Client> getAllClients() 
	{
		logger.info("request for fetchall data from client{}");
		return clientRepository.findAll();
	}

	public Optional<Client> getClientById(int id)
	{
		logger.info("request for fetchall data from client by id{}",id);
		return clientRepository.findById(id);
	}

	public Client updateById(Client client)
	{
		logger.info("request for saveall data from client by id{}",client);
		return clientRepository.save(client);
	}

	public void deleteById(Integer id) {
		logger.info("request for deleteall data from client by id{}",id);
	  clientRepository.deleteById(id);	
	}
}
