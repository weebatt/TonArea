package by.titanic.server.controllers;

import by.titanic.server.DTO.ProposalInfoDTO;
import by.titanic.server.models.Proposal;
import by.titanic.server.services.ProposalProfileService;
import by.titanic.server.services.ProposalService;
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
}
