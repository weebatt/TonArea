package by.titanic.server.services;

import by.titanic.server.models.Proposal;
import by.titanic.server.repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProposalService {

    @Autowired
    private ProposalRepository proposalRepository;

    public List<Proposal> getAllProposals() {
        return proposalRepository.findAll();
    }

    public Proposal createProposal(Proposal proposal) {
        return proposalRepository.save(proposal);
    }
}

