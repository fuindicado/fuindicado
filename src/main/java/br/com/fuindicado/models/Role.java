package br.com.fuindicado.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="role")
public class Role {
	
	@Id
	private String id;

	@NotNull(message = "{message.model.role.rolename.null}")
	@Size(min=5, message = "{message.model.role.rolename.size.min}")
	private String roleName;

}
