class CCertifiable {
 public:
  CCertifiable() : certified(false) {}

  __inline bool Certified () const {return this->certified ;           }
  virtual void  Uncertify ()       {this->certified = false;           }
  virtual int   Certify   ()       {this->certified = true ; return 0; }

 private:
  bool certified;
};

// use these macros to define certification parameters for classes
//  which are derived from CCertifiable

// use the first to make one that is 4 bytes or smaller
//  the second one for larger members in memory
#define CertParamA(type,member_name,accessor_name) type member_name; \
public: \
	__inline void Set##accessor_name(type _##member_name) {assert(!Certified()); member_name = _##member_name;} \
	__inline type Get##accessor_name() const {return member_name;} 
	

#define CertParamB(type,member_name,accessor_name) type member_name; \
public: \
	__inline type& accessor_name() {assert(!Certified());return member_name;} \
	__inline const type& c##accessor_name() const {return member_name;}
