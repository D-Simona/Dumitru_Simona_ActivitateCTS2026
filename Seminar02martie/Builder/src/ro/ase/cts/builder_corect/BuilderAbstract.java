package ro.ase.cts.builder_corect;



public interface BuilderAbstract {
    RezervareFinal build();

    BuilderAbstract setGenMuzical(String genMuzical);
    BuilderAbstract setNrPersoane(int nrPersoane);
    BuilderAbstract setCuloareFataMasa(String culoareFataMasa);
    BuilderAbstract setLaGeam(boolean laGeam);
    BuilderAbstract setScaunErgonomic(boolean scaunErgonomic);
}
