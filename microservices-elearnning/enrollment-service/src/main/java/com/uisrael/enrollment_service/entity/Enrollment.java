package com.uisrael.enrollment_service.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "enrollment")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Enrollment {
	@Id
	private String id;
	private String iduser;
	private String idcourse;
	private String state;
	private String description;
	private String creationdate;

}
