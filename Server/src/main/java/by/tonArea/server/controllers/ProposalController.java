package by.tonArea.server.controllers;

import by.tonArea.server.DTO.ProposalInfoDTO;
import by.tonArea.server.models.Proposal;
import by.tonArea.server.services.ProposalProfileService;
import by.tonArea.server.services.ProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proposals")
public class ProposalController {

    @Autowired
    private ProposalService proposalService;

    @Autowired
    private ProposalProfileService proposalProfileService;


    @GetMapping
    public List<Proposal> getAllProposals() {
        return proposalService.getAllProposals();
    }

    @PostMapping
    public Proposal createProposal(@RequestBody Proposal proposal) {
        return proposalService.createProposal(proposal);
    }

    /**
     *Метод возращает информацию для страницы конкретного предложения
     */
    @GetMapping("/{proposalId}")
    public ProposalInfoDTO getProposal(@PathVariable Long proposalId) {
        return proposalProfileService.showProposalProfile(proposalId);
    }

    /**
     * Update an existing proposal
     */
    @PutMapping("/{proposalId}")
    public Proposal updateProposal(@PathVariable Integer proposalId, @RequestBody Proposal updatedProposal) {
        return proposalService.updateProposal(proposalId, updatedProposal);
    }

    /**
     * Delete a proposal
     */
    @DeleteMapping("/{proposalId}")
    public void deleteProposal(@PathVariable Integer proposalId) {
        proposalService.deleteProposal(proposalId);
    }

    /**
     * Publish a proposal
     */
    @PostMapping("/{proposalId}/publish")
    public Proposal publishProposal(@PathVariable Integer proposalId) {
        return proposalService.publishProposal(proposalId);
    }
}
