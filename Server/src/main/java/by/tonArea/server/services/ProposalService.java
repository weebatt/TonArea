package by.tonArea.server.services;

import by.tonArea.server.models.Proposal;
import by.tonArea.server.repositories.ProposalRepository;
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

    public Proposal getProposalById(Integer id) {
        return proposalRepository.findById(id).orElse(null);
    }

    public Proposal updateProposal(Integer id, Proposal updatedProposal) {
        return proposalRepository.findById(id).map(proposal -> {
            proposal.setTopic(updatedProposal.getTopic());
            proposal.setDescription(updatedProposal.getDescription());
            proposal.setStartDate(updatedProposal.getStartDate());
            proposal.setEndDate(updatedProposal.getEndDate());
            proposal.setStatus(updatedProposal.getStatus());
            proposal.setMapOfOptions(updatedProposal.getMapOfOptions());
            return proposalRepository.save(proposal);
        }).orElseThrow(() -> new RuntimeException("Proposal not found"));
    }

    public void deleteProposal(Integer id) {
        proposalRepository.deleteById(id);
    }

    public Proposal publishProposal(Integer id) {
        return proposalRepository.findById(id).map(proposal -> {
            proposal.setStatus("PUBLISHED");
            return proposalRepository.save(proposal);
        }).orElseThrow(() -> new RuntimeException("Proposal not found"));
    }

}

