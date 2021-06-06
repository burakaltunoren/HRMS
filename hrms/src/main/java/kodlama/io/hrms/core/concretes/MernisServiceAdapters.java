package kodlama.io.hrms.core.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.abstracts.CandidateCheckService;
import kodlama.io.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapters implements CandidateCheckService {
	KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Candidate candidate) {

		try {
			return kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalityId()),
					candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(),
					candidate.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

}
