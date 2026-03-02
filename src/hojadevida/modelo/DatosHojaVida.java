package hojadevida.modelo;

/**
 * Modelo de datos para la Hoja de Vida.
 */
public class DatosHojaVida {

    // ========== PERSONALIZA TUS DATOS AQUÍ ==========
    private String nombre = "Carlos Mario Bucheli Prado";
    private String titulo = "Estudiante de Desarrollo de software e Ingeniería Electronica y Telecomunicaciones";
    private String ciudad = "Popayán, Colombia";
    private String telefono = "+57 315 471 3442";
    private String email = "cabucheli@unimayor.edu.com";
    private String github = "https://github.com/carlosmariobucheliprado/Poyectos";
    private String[] habilidadesTecnicas = {"Java", "Git y GitHub", "Programación", "Estructura de Datos","Arduino","Fusion 360", "Net Beans"};
    private String[] habilidadesBlandas = {"Trabajo en equipo", "Comunicación", "Resolución de problemas","Análisis","Estrategia","Paciencia","Liderazgo"};
    private String idiomas = "Español - Nativo\nEnglish - Básico (B2)";
    private String perfil = "Planifica, analiza, diseña e implementa sistemas software mediante la aplicación de metodologías estándar de desarrollo.\r\n" + //
                "Diseña algoritmos y programas para solucionar problemas específicos, aplicando el paradigma orientado a objetos.\r\n" + //
                "Tiene la capacidad de desarrollar aplicaciones software dinámicas y extensibles.\r\n" + //
                "Está en la capacidad de integrarse a equipos de desarrollo de software\r\n" + //
                "Apoya funciones de administración de redes de datos.\r\n" + //
                "Tiene la capacidad crítica y creativa, para liderar procesos de sistematización en diferentes sectores públicos y privados.\r\n" + //
                "Posee la actitud y capacidad para el trabajo en equipo que le permite relacionarse de manera efectiva con su entorno laboral.\nEscribe aquí 2-3 oraciones sobre ti, tus intereses y objetivos profesionales.";
    private String experiencia = "2024-2025\n[Cargo] - [Empresa]\n[Ciudad]";
    private String educacion = "2019-2021\n[Ingeniería Electrónica y Telecomunicaciones] - [Universidad Del Cauca]\n[Popayan]"+"\n2021-2026\n[Desarrollo de Software] - [Universidad Colegio Mayor Del Cauca]\n[Popayan]";
    private String[] areasInteres = {"Estructura de Datos", "Algoritmos", "Ingeniería de Software"};
    private String proyectos = "• [Nombre del proyecto] - [Breve descripción]";
    // =================================================

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }
    public String[] getHabilidadesTecnicas() { return habilidadesTecnicas; }
    public void setHabilidadesTecnicas(String[] h) { this.habilidadesTecnicas = h; }
    public String[] getHabilidadesBlandas() { return habilidadesBlandas; }
    public void setHabilidadesBlandas(String[] h) { this.habilidadesBlandas = h; }
    public String getIdiomas() { return idiomas; }
    public void setIdiomas(String idiomas) { this.idiomas = idiomas; }
    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
    public String getExperiencia() { return experiencia; }
    public void setExperiencia(String exp) { this.experiencia = exp; }
    public String getEducacion() { return educacion; }
    public void setEducacion(String ed) { this.educacion = ed; }
    public String[] getAreasInteres() { return areasInteres; }
    public void setAreasInteres(String[] a) { this.areasInteres = a; }
    public String getProyectos() { return proyectos; }
    public void setProyectos(String p) { this.proyectos = p; }

    public String getHabilidadesTecnicasFormateadas() {
        return "• " + String.join("\n• ", habilidadesTecnicas);
    }
    public String getHabilidadesBlandasFormateadas() {
        return "• " + String.join("\n• ", habilidadesBlandas);
    }
    public String getAreasInteresFormateadas() {
        return "• " + String.join("\n• ", areasInteres);
    }
}
