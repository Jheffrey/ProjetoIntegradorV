package projetointegradorv.imigrandes.domain.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidato {
	
	@Id
	private String id;
	
	private String nome;
	
	private String cpf;
	
	private String DtNascimento;
	
	private int senha;
	
	private String usuario;
	
	private String Origem;
	
	private LocalDateTime createdAt;
    
    private LocalDateTime modifiedAt; 	

}
