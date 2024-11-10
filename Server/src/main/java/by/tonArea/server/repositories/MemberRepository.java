package by.tonArea.server.repositories;

import by.tonArea.server.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}

